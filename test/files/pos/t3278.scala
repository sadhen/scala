class Foo
class Test {
	def update[B](x : B, b : Int): Unit = {}
	def apply[B](x : B) = 1
}

object Test {
	def main(a : Array[String]): Unit = {
		val a = new Test
		val f = new Foo
		a(f) = 1 //works
		a(f) = a(f) + 1 //works
		a(f) += 1 //error: reassignment to val
	}
}