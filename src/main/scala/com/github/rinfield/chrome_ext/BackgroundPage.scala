package com.github.rinfield.chrome_ext

import scalajs.js.JSApp
import scalajs.js.annotation.JSExport

@JSExport
object BackgroundPage extends JSApp {

  @JSExport
  override def main(): Unit = {
    println("Hello world!")
  }
}
