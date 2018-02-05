package com.archiver

import com.archiver.command.CommandParser

object Main {
  def main(args: Array[String]): Unit = {
    // JCommander parse
    // execute command
    // command example: --method LZMA, --cores 4, --dictionary 32, --word 4, --encryption etc.
    val command = CommandParser.getParsedCommand()
  }
}
