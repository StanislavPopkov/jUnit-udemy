package module3.lecture_04_atTag;

import org.junit.runner.RunWith;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.runner.JUnitPlatform;

@RunWith(JUnitPlatform.class)
@SelectPackages("Module3.lecture_04_atTag")
@IncludeTags("development")
class DevelopmentTests {}
