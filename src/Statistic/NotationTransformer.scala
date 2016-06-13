package Statistic


class NotationTransformer {
  def parse(temp: Any): Any = {
    temp match {
      case mas: Notation => getOutputMessage(mas)
      case moves: Int => "Game is end. Number of steps a bot is " + Integer.toString(moves)
    }
  }

  def getOutputMessage(temp: Notation): String = {
    "Player put "+ temp.getPlayer+" to "+temp.getButton + " Button"
  }
}
