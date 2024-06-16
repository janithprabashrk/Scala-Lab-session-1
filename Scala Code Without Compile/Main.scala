object main {
    def main (args: Array[String]): Unit = {

        //Question 1
        def areaOfDisk(r: Double): Double = {
            math.Pi * r * r
        }
        val r = 5
        val area = areaOfDisk(r)
        println("Area Of a Disk = " + r)  

        //Question 2
        def tempConverter(t: Double): Double = {
            t * 1.8000 + 32.00
        }
        val t = 35
        val f = tempConverter(t)
        println("Temperature " + t + "ºC is equal to = " + f + "ºF")

        //Question 3
        def volume(rad: Double): Double = {
            4/3 * math.Pi *rad *rad *rad
        }
        val rad = 5
        val vol = volume(r)
        println("Volume of a Sphere = " + vol)

        //Question 4
        def Wholesalecost(n: Int): Double = {
            val Cprice = 24.95
            val discount = 0.4
            val discountedPrice = Cprice * (1 - discount)
            val shippingCost = if(n <= 50) {
                3
            } else {
                3 + 0.75 * (n - 50)
            }
            discountedPrice * n + shippingCost
        }

        val n = 60
        val totalCost = Wholesalecost(n)
        println("Wholesale Cost = " + totalCost)

        //Question 5
        def runningTime(): Int = {
            val easyPspeed = 8
            val tempoPspeed = 7
            val easyPDist = 2
            val tempoPDist = 3
            (tempoPspeed*tempoPDist) + (2 * easyPspeed / easyPDist )
        }
        val Time = runningTime()
        println("Total Running Time = " + Time)
    }
}