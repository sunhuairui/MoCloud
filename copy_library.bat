@CLS

@SET HOME=%cd%
@SET HOME_SOURCE=%HOME%\library

@SET HOME_TARGET=%HOME%\mp-cloud-develop\webroot\WEB-INF\lib\
MKDIR %HOME_TARGET%
@REM COPY /Y %HOME_SOURCE%\mo-common.jar  %HOME_TARGET%
@REM COPY /Y %HOME_SOURCE%\mo-core.jar    %HOME_TARGET%
@REM COPY /Y %HOME_SOURCE%\mo-logic.jar   %HOME_TARGET%
@REM COPY /Y %HOME_SOURCE%\mo-web.jar     %HOME_TARGET%
@REM COPY /Y %HOME_SOURCE%\mo-cloud.jar   %HOME_TARGET%
@REM COPY /Y %HOME_SOURCE%\mo-content.jar %HOME_TARGET%

@SET HOME_TARGET=%HOME%\mp-cloud-design\webroot\WEB-INF\lib\
MKDIR %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-common.jar  %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-core.jar    %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-logic.jar   %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-web.jar     %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-cloud.jar   %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-content.jar %HOME_TARGET%

@SET HOME_TARGET=%HOME%\mp-cloud-content\webroot\WEB-INF\lib\
MKDIR %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-common.jar   %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-lib-lzma.jar %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-core.jar     %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-logic.jar    %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-web.jar      %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-cloud.jar    %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-content.jar  %HOME_TARGET%

@SET HOME_TARGET=%HOME%\mp-cloud-storage\webroot\WEB-INF\lib\
MKDIR %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-common.jar  %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-core.jar    %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-logic.jar   %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-web.jar     %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-cloud.jar   %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-content.jar %HOME_TARGET%

@SET HOME_TARGET=%HOME%\mp-cloud-logger\webroot\WEB-INF\lib\
MKDIR %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-common.jar  %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-core.jar    %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-logic.jar   %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-web.jar     %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-cloud.jar   %HOME_TARGET%
COPY /Y %HOME_SOURCE%\mo-content.jar %HOME_TARGET%
