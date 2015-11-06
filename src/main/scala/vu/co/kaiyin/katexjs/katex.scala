package vu.co.kaiyin.katexjs

import java.awt.DisplayMode

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

/**
  * Created by kaiyin on 06/11/2015.
  */
@JSName("katex")
@js.native
object katex extends js.Object {
  def render(texString: String, elem: dom.Element, opts: RenderOpts): Unit = js.native

  def render(texString: String, elem: dom.Element): Unit = js.native
}

@js.native
trait RenderOpts extends js.Object {
  def displayMode: Boolean = js.native

  def throwOnError: Boolean = js.native

  def errorColor: String = js.native
}

object RenderOpts {
  def apply(d: Boolean = false, t: Boolean = true, e: String = "cc0000"): RenderOpts = js.Dynamic.literal(
    displayMode = d,
    throwOnError = t,
    errorColor = e
  ).asInstanceOf[RenderOpts]
}

@js.native
object global extends js.GlobalScope {
  def renderMathInElement(elem: dom.Element, options: AutoRenderOpts): Unit = js.native
}

@js.native
trait DelimiterOpt extends js.Object {
  def left: String = js.native

  def right: String = js.native

  def display: Boolean = js.native
}

object DelimiterOpt {
  def apply(
             l: String = "$$",
             r: String = "$$",
             d: Boolean = true
           ): DelimiterOpt = js.Dynamic.literal(
    left = l,
    right = r,
    display = d
  ).asInstanceOf[DelimiterOpt]
}

@js.native
trait AutoRenderOpts extends js.Object {
  def delimiters: js.Array[DelimiterOpt] = js.native

  def ignoredTags: js.Array[String] = js.native
}

object AutoRenderOpts {
  def apply(
             d: js.Array[DelimiterOpt] = js.Array[DelimiterOpt](
               DelimiterOpt(),
               DelimiterOpt( """\[""", """\]""", true),
               DelimiterOpt( """\(""", """\)""", false)
             ),
             i: js.Array[String] = js.Array("script", "noscript", "style", "textarea", "pre", "code")
           ): AutoRenderOpts = {
    js.Dynamic.literal(
      delimiters = d,
      ignoredTags = i
    ).asInstanceOf[AutoRenderOpts]
  }
}


