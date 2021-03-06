package com.landoop.streamreactor.connect.hive.kerberos

import java.io.File

trait FileCreation {
  def createFile(path: String): File = {
    val file = new File(path)
    if (!file.exists()) {
      file.createNewFile()
    }
    file
  }
}
