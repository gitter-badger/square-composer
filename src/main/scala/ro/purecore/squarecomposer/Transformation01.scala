package ro.purecore.squarecomposer

import org.scalajs.dom
import org.scalajs.dom.html
import ro.purecore.squarecomposer.Effects._
import ro.purecore.squarecomposer.InitialFigure._

import scala.scalajs.js.annotation.JSExport


@JSExport
object Transformation01 {

  @JSExport
  def main(canvas: html.Canvas): Unit = {
    implicit val ctx = canvas.getContext2D
    def run() = draw(initialFigure.map(_.copy(color = blue)), 0, 0)
    dom.setInterval(() => run(), 50) }
}
