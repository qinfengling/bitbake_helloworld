DESCRIPTION = "Prints Hello World"
PN = 'helloworld'
PV = '1'

python do_build() {
    bb.plain("********************");
    bb.plain("*                  *");
    bb.plain("*  Hello, World!   *");
    bb.plain("*                  *");
    bb.plain("********************");
}

python do_clean() {
    bb.plain("********************");
    bb.plain("*                  *");
    bb.plain("*  Clean  World!   *");
    bb.plain("*                  *");
    bb.plain("********************");
}

