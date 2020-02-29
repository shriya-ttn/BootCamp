package healthycoderapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DietPlannerTest {

    DietPlanner dietPlanner;


    @BeforeEach
    void setup(){
        dietPlanner = new DietPlanner(20,30,50);
    }

    @Test
    void shouldRetrunTrue_CorrectDietPlan_WhenCorrectCoder(){

        //given

        Coder coder = new Coder(1.82, 75.0,26, Gender.MALE);
        DietPlan expected = new DietPlan(2202, 110, 73, 275);

        //when
        DietPlan actual = dietPlanner.calculateDiet(coder);

        //then
        assertAll(

                ()-> assertEquals(expected.getCalories(), actual.getCalories()),
                ()-> assertEquals(expected.getCarbohydrate(), actual.getCarbohydrate()),
                ()-> assertEquals(expected.getFat(), actual.getFat()),
                ()-> assertEquals(expected.getProtein(), actual.getProtein())
        );
    }

    @Test
    void shouldReturnFalse_WhenWrongDietPlan_WhenBadCoder(){

        //given
        Coder coder = new Coder(1.82, 98.0,20, Gender.MALE);
        DietPlan expected = new DietPlan(2631, 132, 88, 329);

        //when
        DietPlan actual = dietPlanner.calculateDiet(coder);

        //then
        assertAll(
                ()-> assertEquals(expected.getCalories(), actual.getCalories()),
                ()-> assertEquals(expected.getCarbohydrate(), actual.getCarbohydrate()),
                ()-> assertEquals(expected.getFat(), actual.getFat()),
                ()-> assertEquals(expected.getProtein(), actual.getProtein())
        );
    }

}