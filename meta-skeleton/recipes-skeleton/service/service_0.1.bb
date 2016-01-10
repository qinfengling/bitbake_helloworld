SUMMARY = "The canonical example of init scripts"
SECTION = "base"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/COPYRIGHT;md5=349c872e0066155e1818b786938876a4"
WORKDIR = "/home/vagrant/tmp/bitbake_demo/bitbake_helloworld/meta-skeleton/recipes-skeleton/service/service"
PR = "r0"
PN = "service"
PV = "1"

SRC_URI = "file://skeleton \
	   file://skeleton_test.c \
	   file://COPYRIGHT \
	   "

do_compile () {
	echo "xxxxx-${WORKDIR}"
	touch /tmp/do_compile
	gcc ${WORKDIR}/skeleton_test.c -o ${WORKDIR}/skeleton-test
}

python do_install () {
	bb.plain("Install finish");
}

