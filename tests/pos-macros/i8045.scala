import scala.quoted._
object Test
  def run(using Quotes)(tree: quotes.reflect.Tree): Unit =
    '{  ${ makeExpr(tree) } + 1  }
  def makeExpr(using Quotes)(tree: quotes.reflect.Tree): Expr[Int] = ???
