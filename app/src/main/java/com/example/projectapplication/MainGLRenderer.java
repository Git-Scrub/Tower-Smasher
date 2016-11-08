package com.example.projectapplication;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import com.example.projectapplication.SpriteObjects.Triangle;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Lionel on 11/4/2016.
 */
public class MainGLRenderer implements GLSurfaceView.Renderer
{
    private final Triangle triangle = new Triangle();

    @Override
    public void onSurfaceCreated(GL10 unused, EGLConfig config)
    {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public void onDrawFrame(GL10 ununused)
    {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        this.triangle.draw();
    }

    @Override
    public void onSurfaceChanged(GL10 unused, int width, int height)
    {
        GLES20.glViewport(0, 0, width, height);
    }

    /**
     * Renders a stringle containing OpenGL's shading code language
     * @param type
     * @param shaderCode Code to compile
     * @return Shader to used for shading
     */
    public static int loadShader(int type, String shaderCode){

        // create a vertex shader type (GLES20.GL_VERTEX_SHADER)
        // or a fragment shader type (GLES20.GL_FRAGMENT_SHADER)
        int shader = GLES20.glCreateShader(type);

        // add the source code to the shader and compile it
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);

        return shader;
    }


}
