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

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        List<UserMealWithExceed> filtResultList = getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
//        .toLocalDate();
//        .toLocalTime();
        filtResultList.forEach(System.out::println);
    }

    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        // return filtered list with correctly exceeded field
    	 // должны возвращаться только записи между startTime и endTime
    	
    	/* Grouping LocalDateTime and calories by day*/
    	Map<LocalDate, Integer> dayCalorMap = new HashMap<>();
    	for (UserMeal us  : mealList) {
    		/*if date not yet in map, just put date and calories */
			LocalDate key = us.getDateTime().toLocalDate();
			if(dayCalorMap.get(key) == null) {
				dayCalorMap.put(key, us.getCalories());
			} else {
				/*if date already in map , get same date and summing calories to exists calories in map*/
				dayCalorMap.put(key,   (dayCalorMap.get(key)) + us.getCalories()  );
			}
		}
    	 dayCalorMap.forEach( (a,b) -> System.out.println(a + " :: " +b) );
    	 
    	 	/* if such date exists : summing calories*/
    	
        return new ArrayList<>();
    }
}
