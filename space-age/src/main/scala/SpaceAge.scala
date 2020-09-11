object SpaceAge {
    def onEarth(second: Double): Double =  second/31557600

    def onMercury(second: Double): Double = onEarth(second)/0.2408467

    def onVenus(second: Double): Double =onEarth(second)/0.61519726

    def onMars(second: Double): Double =onEarth(second)/1.8808158

    def onJupiter(second: Double): Double =onEarth(second)/11.862615

    def onSaturn(second: Double): Double =onEarth(second)/29.447498

    def onUranus(second: Double): Double =onEarth(second)/84.016846

    def onNeptune(second: Double): Double =onEarth(second)/164.79132


}
