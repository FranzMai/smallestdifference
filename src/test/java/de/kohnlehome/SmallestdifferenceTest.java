package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;


public class SmallestdifferenceTest {
    private ISmallestdifference smallestdifference;
    @BeforeEach
    public void init(){
        //Arrange
        smallestdifference = new Smallestdifference();
    }

    @Test
    public void setSmallestdifferenceTest() {
        //Arrange
        int[] array1 = {1,3,15,11,2};
        int[] array2 = {23,127,235,19,8};
        //Act
        int result = this.smallestdifference.smallestdifference(array1,array2);
        //Assert
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void setSmallestdifferenceTest2() {
        //Arrange
        int[] array1 = {5,6,7};
        int[] array2 = {9,10,11};
        //Act
        int result =  this.smallestdifference.smallestdifference(array1,array2);
        //Assert
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void setSmallestdifferenceTest3() {
        //Arrange
        int[] array1 = {1};
        int[] array2 = {1};
        //Act
        int result =  this.smallestdifference.smallestdifference(array1,array2);
        //Assert
        assertThat(result).isEqualTo(0);
    }
}