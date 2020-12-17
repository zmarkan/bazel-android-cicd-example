package com.circleci.bazelsample

import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.assertj.core.api.Assertions.assertThat

@RunWith(AndroidJUnit4::class)
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertThat(4).isEqualTo(2+2)
    }

    @Test
    fun greeter(){
        val greeter = Greeter("CircleCI")
        assertThat(greeter.greet()).isEqualTo("Hello, CircleCI!")
    }
//    @Test
//    fun failing_maths() {
//        assertThat(4).isEqualTo(2+3)
//    }


}