class AirConditioner {

    private var isOn: Boolean = false;
    private var temperature: Int = 16;

    fun powerOff(){
        isOn = false
    }

    fun powerOn(){
        isOn = true
    }

    fun isOn(): Boolean {
        return isOn
    }

    fun increaseTemperature(interval: Int) {
        val isTemperatureRange = temperature in 16..29
        if (isOn && isTemperatureRange) {
            temperature += interval
        }
    }

    fun getTemperature(): Int {
        return temperature
    }

    fun decreaseTemperature() {
        val isTemperatureRange = temperature in 17..29
        if (isOn && isTemperatureRange) {
            temperature--
        }
    }

}