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

public class Lambdos {
	static List<UserMeal> LISTOFMEALS = Arrays.asList(
			new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500),
			new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Обед", 1000),
			new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Ужин", 500),
			new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Завтрак", 1000),
			new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 13, 0), "Обед", 500),
			new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 20, 0), "Ужин", 510));

	public static void main(String[] args) {

 		getFilteredWithExceeded(LISTOFMEALS, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);
//      .toLocalDate();
//      .toLocalTime();
		System.out.println("=========================");
		
		List<UserMealWithExceed> mealsWithExceeded = getFilteredWithExceeded(LISTOFMEALS, LocalTime.of(7, 0),
				LocalTime.of(12, 0), 2000);
 		mealsWithExceeded.forEach(System.out::println);
	}

	public static List<UserMealWithExceed> getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime,
			LocalTime endTime, int caloriesPerDay) {
	 // должны возвращаться только записи между startTime и endTime
//		LISTOFMEALS.stream()
//		.collect(Collectors.groupingBy(g -> g.getDateTime().toLocaDate() )) ;

		
		Map<LocalDate, Integer> map = new HashMap<>();
		/* Grouping calories by day*/
		for (UserMeal us : mealList) {
			LocalDate key = us.getDateTime().toLocalDate();
			if(map.get(key) == null) {
				map.put(key, us.getCalories());
			} else {
				/* if such date exists : summing calories*/
 				map.put(key, (map.get(key)) + us.getCalories());
			}
		}
// 		map.forEach( (a, b) -> System.out.println(a + " ; " + b) );
 		
		List<UserMealWithExceed>  resultList = new ArrayList<>();
		
 		boolean exceeded = false;
 		
 		for (UserMeal meal : mealList) {
			if(map.get(meal.getDateTime().toLocalDate()) > caloriesPerDay) {
				exceeded  = true;
			}
			UserMealWithExceed umw = new UserMealWithExceed(meal.getDateTime(), meal.getDescription(), meal.getCalories(), exceeded);		
			
			if(TimeUtil.isBetween(meal.getDateTime().toLocalTime(), startTime, endTime)) {
				
				resultList.add(umw);
			}
		}
 		 
 		for (Map.Entry<LocalDate, Integer> es : map.entrySet()) {
			 
		}
 		
 		
		return resultList;
	}
	
	public static List<UserMealWithExceed> getFilteredWithExceededOLD(List<UserMeal> mealList, LocalTime startTime,
			LocalTime endTime, int caloriesPerDay) {
		// 
		return null;
	}
}
