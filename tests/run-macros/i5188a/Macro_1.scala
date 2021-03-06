import scala.quoted._

object Lib {
  inline def sum(inline args: Int*): Int = ${ impl('args) }
  def impl(args: Expr[Seq[Int]]) (using Quotes): Expr[Int] = Expr(args.unliftOrError.sum)
}
