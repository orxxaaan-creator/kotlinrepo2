package com.zeynalovsapps.kproject

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class WaterTrackerTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Before
    fun setUp() {
        composeTestRule.setContent {
            WaterTracker()
        }
    }

    @Test
    fun testAddWaterButton_increasesAmount() {
        composeTestRule.onNodeWithText("0 мл").assertExists()

        composeTestRule.onNodeWithText("+250 мл").performClick()
        composeTestRule.onNodeWithText("250 мл").assertExists()
    }

    @Test
    fun testFinishDayButton_withSuccessStreak() {
        repeat(6) {
            composeTestRule.onNodeWithText("+250 мл").performClick()
        }
        composeTestRule.onNodeWithText("1500 мл").assertExists()

        composeTestRule.onNodeWithText("Завершить день").performClick()
        composeTestRule.onNodeWithText("0 мл").assertExists()

        composeTestRule.onNodeWithText("Дней подряд с нормой: 1").assertExists()
    }
    @Test
    fun testFinishDayButton_resetsStreakIfNormNotMet() {

        composeTestRule.onNodeWithText("+250 мл").performClick()

        composeTestRule.onNodeWithText("Завершить день").performClick()


        composeTestRule.onNodeWithText("Дней подряд с нормой: 0").assertExists()
    }
}
