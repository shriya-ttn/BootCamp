package healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void should_ReturnFalse_When_DietNotRecommended() {
        //given
        double weight= 64;
        double height = 1.53;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        //then
        assertTrue(recommended);
    }


    @Test
    void should_ExceptionsDietNotRecommended() {
        //given
        double weight= 64.0;
        double height = 0.0;

       //when
        Executable executable = () -> BMICalculator.isDietRecommended(weight,height);

        //then
        assertThrows(ArithmeticException.class,  executable);
    }

    void should_ReturnCoder_CoderLListNotEmpty(){
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.82, 98.0));
        coders.add(new Coder(1.82, 68.0));
        coders.add(new Coder(1.82, 58.0));

        Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

        assertAll(
                () -> assertEquals(1.82, coderWorstBMI.getHeight()),
                () -> assertEquals(98, coderWorstBMI.getWeight())

        );

    }

    @Test
    void findCoderWithWorstBMI() {
    }

    @Test
    void getBMIScores() {
    }
}