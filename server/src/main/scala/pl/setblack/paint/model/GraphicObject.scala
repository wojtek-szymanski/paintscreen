package pl.setblack.paint.model

import pl.setblack.paint.api.{PutPixelEvent, InputEvent}
import pl.setblack.paint.model.GraphicObjectView
/**
 * Created by Kanapka on 1/2/2015.
 */


abstract class GraphicObject(val id: Long) extends Serializable {
 def toView:GraphicObjectView ;

}
