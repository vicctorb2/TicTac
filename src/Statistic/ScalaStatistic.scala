package Statistic

/**
 * Analysis of game statistics
 */
class ScalaStatistic {
  /**
   * Find count of every figure
   */
  def getStatistic(gameInfo: Array[Notation]){
    val tempArray = for (temp: Notation <- gameInfo) yield temp
    val statistic = new Array[Int](9)

    for (temp: Notation <- tempArray)
      statistic(temp.getButton)+=1

    new StatisticTable("Statistic", statistic, statistic.indexOf(statistic.max))
  }
}
