$input v_texcoord0

/*
 * Copyright 2014-2015 Dario Manesku. All rights reserved.
 * License: http://www.opensource.org/licenses/BSD-2-Clause
 */

#include "shader.shdr"
#include "utils.shdr"

SAMPLER2D(u_texColor, 0);

void main()
{
    float lum = decodeRE8(texture2D(u_texColor, v_texcoord0));

    gl_FragColor.xyz = vec3_splat(lum);
    gl_FragColor.w = 1.0;
}

/* vim: set sw=4 ts=4 expandtab: */
