#!/bin/bash
bitbake -f helloworld $@
bitbake -f -c compile -b service
