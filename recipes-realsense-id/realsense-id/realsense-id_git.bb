# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   3rdparty/libjpeg-turbo_2_1_0/LICENSE.md
#   3rdparty/libjpeg-turbo_2_1_0/release/License.rtf
#   3rdparty/spdlog_1_8_0/LICENSE
#   3rdparty/spdlog_1_8_0/include/spdlog/fmt/bundled/LICENSE.rst
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=937d52c4d8d062521bd7341591d9b6bc \
                    file://3rdparty/mbedtls-2.25.0/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://3rdparty/libjpeg-turbo_2_1_0/LICENSE.md;md5=970f17d51650fe54e4f839c6e6121f79 \
                    file://3rdparty/libjpeg-turbo_2_1_0/release/License.rtf;md5=ee099ee7ddabeaddd30f6d901fe299de \
                    file://3rdparty/spdlog_1_8_0/LICENSE;md5=85327c46e04d2b6a4440d63b75a21b1a \
                    file://3rdparty/spdlog_1_8_0/include/spdlog/fmt/bundled/LICENSE.rst;md5=af88d758f75f3c5c48a967501f24384b"

SRC_URI = "git://github.com/NoahRosa/RealSenseID.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "76cf713161344143a471d74e1416283b8b01e53e"

S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Doxygen
# NOTE: the following library dependencies are unknown, ignoring: log
#       (this is based on recipes that have previously been built and packaged)
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DRSID_INSTALL=1 -DCMAKE_SKIP_RPATH=TRUE"

