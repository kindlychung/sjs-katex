package vu.co.kaiyin.katexjs

import org.scalajs.dom
import org.scalajs.dom.raw.{KeyboardEvent, HTMLTextAreaElement}

import scala.scalajs.js.annotation.JSExport

/**
  * Created by kaiyin on 06/11/2015.
  */
@JSExport
class Main {
  @JSExport
  def main(): Unit = {
    val mathIn = dom.document.getElementById("mathinput").asInstanceOf[HTMLTextAreaElement]
    val mathOut = dom.document.getElementById("mathoutput")
    mathIn.onkeyup =
      (e: KeyboardEvent) => {
        println("fired!")
        println(mathIn.value)
        katex.render(mathIn.value, mathOut)
      }
  }
}
