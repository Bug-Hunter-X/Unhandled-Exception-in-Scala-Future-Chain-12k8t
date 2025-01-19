```scala
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

implicit val ec: ExecutionContext = scala.concurrent.ExecutionContext.global

object ImplicitExecutionContext extends App {
  val future1: Future[Int] = Future { 10 / 0 }
  val future2: Future[Int] = Future { 10 }

  val combinedFuture: Future[Int] = for {
    result1 <- future1
    result2 <- future2
  } yield result2 + result1

  combinedFuture.onComplete { 
    case Success(value) => println(s"Success: $value")
    case Failure(exception) => println(s"Failure: ${exception.getMessage}")
  }

  Thread.sleep(5000) // Keep the main thread alive to see the output
}
```