package lam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.UserMeal;
import model.UserMealWithExceed;
import util.TimeUtil;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil2 {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
        List<UserMealWithExceed> filtResultList = getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
//      .toLocalDate();
//      .toLocalTime();
      filtResultList.forEach(System.out::println);
    }

    public static List<UserMealWithExceed> 
    getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime,
    		LocalTime endTime, int caloriesPerDay) {
        //   return filtered list with correctly exceeded field
    	
    	Map<LocalDate, Integer> map = new HashMap<>();
    	
    	
    	// Grouping LocalDateTime ==> calories
    	for (UserMeal us  : mealList) {
    		LocalDate key = us.getDateTime().toLocalDate();
			if(map.get(key) == null) {
				map.put(key, us.getCalories());
			} else {
				map.put(key, map.get(key) + us.getCalories());
			}
		}
    	
//    	map.forEach(  (a,b) -> System.out.println(a + " ; " + b));
    	List<UserMealWithExceed> resultaltList = new ArrayList<>();
    	// 
    	boolean exceed = false;
     	for (UserMeal um   : mealList) {
     		UserMealWithExceed umw = new UserMealWithExceed(um.getDateTime() , um.getDescription(), um.getCalories(), exceed);
     		if(map.get( um.getDateTime().toLocalDate()) > caloriesPerDay) {
     			exceed = true;
     		}
     		boolean between = TimeUtil.isBetween(um.getDateTime().toLocalTime(), startTime, endTime);
     		// take from to time
     		if(between) {
     			resultaltList.add(umw);
     		}
     	}
        return resultaltList ;
    }
}
