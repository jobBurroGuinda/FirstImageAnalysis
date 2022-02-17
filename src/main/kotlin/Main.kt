import gui.JFrameImage
import open.OpenImage
import java.awt.Color

class Main {
}
fun main(){
    val imageOriginal = OpenImage.openImage()
    val auxOriginal = imageOriginal?.let { JFrameImage(it) }
    val auxBuffer = imageOriginal?.let { OpenImage.toBufferedImage(it) }
    val yellow = Color(255,255,0)
    for(x in 50..150){
        auxBuffer?.setRGB(x,50,yellow.rgb)
    }
    for(y in 50..200) {
        auxBuffer?.setRGB(100, y, yellow.rgb)
    }
    for(x in 50..100){
        auxBuffer?.setRGB(x,200,yellow.rgb)
    }
    val imageResult = auxBuffer?.let { OpenImage.toImage(it) }
    val auxResult = imageResult?.let { JFrameImage(it) }
}