# Scala.js facade to the katex javascript library

Katex is a javascript renderer for math equations, this project provides a facade to call katex code from Scala.js.


## Usage

Add it in your build.sbt at the end of resolvers:


    resolvers += "jitpack" at "https://jitpack.io"

	libraryDependencies += "com.github.kindlychung" % "sjs-katex" % "0.1"


Also see [this file](https://github.com/kindlychung/sjs-katex/blob/master/src/main/scala/vu/co/kaiyin/katexjs/Main.scala).


