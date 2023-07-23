import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object Caesar {
  def main(args: Array[String]): Unit = {

    def encryption (text :String,shift :Int): Unit ={
      var encryptedText=""
      var stringBuilder=new StringBuilder(encryptedText)
      for(i <- 0 to text.length-1){
        if(text.charAt(i).isUpper){
            stringBuilder.append(((text.charAt(i).toInt+shift-65) % 26+65).toChar)
        }else{
          stringBuilder.append(((text.charAt(i).toInt+shift-97) % 26+97).toChar)
        }
      }
      println(stringBuilder)
    }

    def decryption (text :String,shift :Int): Unit ={
      var decryptedText=""
      var stringBuilder=new StringBuilder(decryptedText)
      for(i <- 0 to text.length-1){
        if(text.charAt(i).isUpper){
          stringBuilder.append(((text.charAt(i).toInt-shift-65) % 26+65).toChar)
        }else{
          stringBuilder.append(((text.charAt(i).toInt-shift-97) % 26+97).toChar)
        }
      }
      println(stringBuilder)
    }

    def cipher(): Unit ={
      println("------------------Caesar Cipher-----------------------------")
      println("Rules")
      println("Choose a number between 1 and 25 for shift")
      println(" ")
      println("------------------Encrypt Your Message----------------------")
      println("Enter text you want to encrypt :")
      var  plainText=readLine()
      println("Enter shift value :")
      var shift=readInt()
      encryption(plainText,shift)

      println("------------------Decrypt Your Message----------------------")
      println("Enter text you want to decrypt :")
      var  EncryptText=readLine()
      println("Enter shift value :")
      var shift1=readInt()
      decryption(EncryptText,shift1)
    }

     cipher()
  }

}
