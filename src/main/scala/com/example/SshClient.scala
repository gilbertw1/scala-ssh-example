package com.example

import com.decodified.scalassh._
import org.bouncycastle.jce.provider._

object SshClient extends App {

	SSH("example.net") { client =>
		client.exec("ls -a /") match { 
			case Right(result) => println("Result: " + result.stdOutAsString())
			case Left(error) => println("Error: " + error)
		}
	}

}