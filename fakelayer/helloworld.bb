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

