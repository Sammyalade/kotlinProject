import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class AirConditionerTest {


   @Test
   fun powerOffAc_AcIsOffTest(){
      val airConditioner = AirConditioner()
      airConditioner.powerOff()
      assertFalse(airConditioner.isOn())
   }

   @Test
   fun powerOnAc_AcIsOnTest(){
      val airConditioner = AirConditioner()
      airConditioner.powerOn()
      assertTrue(airConditioner.isOn())
   }

   @Test
   fun powerOnAc_PowerOffAc_acIsOffTest(){
      val airConditioner = AirConditioner()
      airConditioner.powerOn()
      airConditioner.powerOff()
      assertFalse(airConditioner.isOn())
   }

   @Test
   fun powerOnAc_increaseTemperature_temperatureIsIncreasedTest(){
      val airConditioner = AirConditioner()
      airConditioner.powerOn()
      airConditioner.increaseTemperature(1)
      assertEquals(airConditioner.getTemperature(), 17)
   }

   @Test
   fun powerOffAc_increaseTemperature_throwsExceptionTest(){
      val airConditioner = AirConditioner()
      assertFalse(airConditioner.isOn())
      assertThrows(ACIsOffException::class.java){airConditioner.increaseTemperature(1)}
   }



}