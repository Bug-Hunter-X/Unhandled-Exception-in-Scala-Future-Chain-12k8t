# Unhandled Exception in Scala Future Chain

This example showcases a potential problem when chaining Scala Futures: an exception in one Future can cause the entire chain to fail, even if subsequent Futures would otherwise succeed.

The `ImplicitExecutionContext.scala` file contains the buggy code.  The `ImplicitExecutionContextSolution.scala` file provides a solution demonstrating the appropriate use of error handling within the Future chain.

This example highlights the importance of robust error handling when working with asynchronous operations in Scala.  Failure to handle exceptions can lead to unexpected behavior and difficult-to-debug issues.