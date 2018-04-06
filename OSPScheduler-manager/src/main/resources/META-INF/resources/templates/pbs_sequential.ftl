#!/bin/bash

cd ${workingDir}

ln -s ${progHome}/${progExe} ${progExe}

./${progExe} ${args}

rm -f ${progExe}

exit 0;
