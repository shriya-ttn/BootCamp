package com.im;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    @BeforeEach
    public static void startup()
    {
        First first = new First();
    }

    @Test
    void canary(){
        assertTrue(true);
        System.out.println("Test case passed.");
    }

      void should_ReturnTrue_WhenNoArgsIs_Null(String given, String sub, String substitution, String out)
    {
        First first = new First();
        //given
        String mainString = given;
        String subString = sub;
        String replacement = substitution;
        String requiredString = out;
        String received = first.replaceSubString(mainString, subString, replacement);
        //when
        boolean output = requiredString.equals(received);

        //then
        assertTrue(output);
    }

//    @ParameterizedTest(name = "given={0}, sub={1}, substitution={2}")
//    @CsvFileSource(resources = "/Null_testCases_for_String_function.csv", delimiter = ',')
    void should_ReturnFalse_WhenAnyArgsIs_Null(String given, String sub, String substitution)
    {
        First first = new First();
        //given
        String mainString = new String();
        mainString = given;
        String subString = sub;
        String replacement = substitution;
        String received = first.replaceSubString(mainString, subString, replacement);
        /* when */
        //boolean output = mainString.equals(received);

        //then
        //assertTrue(output);
        assertEquals(mainString, received);
    }

    @Test
    void should_ReturnEven(){

        First first = new First();
        List<Integer> testList = new ArrayList<>();

        //given
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(6);

        List<Integer> returnedList = first.filterEvenElements(testList);
        Iterator<Integer> it = returnedList.listIterator();
        boolean flag = true;

        //when
        while(it.hasNext()) {
            if(it.next() % 2 == 0) {
                flag = false;
            }
        }

        //then
        assertTrue(flag);
    }

    @Test
    void check_If_List_Is_NotNull()
    {
        First first = new First();
        List<Integer> testList = new ArrayList<>();

        //given
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(6);
        List<Integer> returnedList = first.filterEvenElements(testList);
        Iterator<Integer> it = returnedList.listIterator();
        boolean flag = true;

        //when
        if(!it.hasNext())
            flag =false;

        //then
        assertTrue(flag);
    }

    @Test
    void shouldThrow_RuntimeException_WhenInvalidInput_isGiven()
    {
        //given
        First first = new First();
        List<BigDecimal> bd = new ArrayList<>();

        //when
        Executable executable = () -> first.calculateAverage(bd);

        //then
        assertThrows(RuntimeException.class, executable);
    }

    @Test
    void shouldReturnTheAverage() {
        First first = new First();
        Random r = new Random();

        //given
        List<BigDecimal> bd = new ArrayList<>();
        for(int i=0; i<10; i++)
        {
            double d = r.nextDouble();
            bd.add(BigDecimal.valueOf(d));
        }
        BigDecimal sum = bd.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal result = sum.divide(new BigDecimal(bd.size()));

        //when
        BigDecimal actual = first.calculateAverage(bd);
        boolean flag = actual.equals(result);

        //then
        assertTrue(flag);
    }

    void returnTrueIfPallindrome(String s1,String s2) {
        First first = new First();
        String original_string = s1;
        String reversed_string = s2;
        boolean output = first.isPallindrome(s1);
        assertTrue(output);
    }

    void returnFalseIfNotPallindrome(String s1,String s2) {
        First first = new First();
        String original_string = s1;
        String reversed_string = s2;
        boolean output = first.isPallindrome(s1);
        assertTrue(output);
    }

}