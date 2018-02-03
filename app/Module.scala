import java.time.Clock

import com.google.inject.AbstractModule
import services.ApplicationTimer

/**
  * Created by david on 03/02/18.
  */
class Module extends AbstractModule {

  override def configure() = {
    bind(classOf[Clock]).toInstance(Clock.systemDefaultZone())
    bind(classOf[ApplicationTimer]).asEagerSingleton()
  }

}
