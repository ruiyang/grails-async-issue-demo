package demo.gorm.issue

class Book {
    String name
    BigDecimal tePercent


    static constraints = {
        tePercent nullable : true , max: 100.00, min:0.00
    }

    def setTePercent(value){
        if(value != null){
            tePercent = new BigDecimal(value as double).setScale(3, BigDecimal.ROUND_HALF_EVEN)
        }else{
            tePercent = null
        }
    }

}
