package modules

import java.util.concurrent.TimeUnit
import org.mongodb.scala.{Completed, Document, Obserble}
import scala.concurrent.Await
import scala.concurrent.duration.Duration

object Helpers {
    implicit class DocumentObservable[C](val observable: Observable[Document]) extends ImplicitObservable[Document]
    implicit class CompleteObservable[C](val observable: Observable[Completed]) extends ImplicitObservable

    trait ImplicitObservable[C] {
        val observable: Observable[C]

        def results: Seq[C] = Await.result(observable.toFuture(), Duration(10, TimeUnit.SECONDS))
    }
}
