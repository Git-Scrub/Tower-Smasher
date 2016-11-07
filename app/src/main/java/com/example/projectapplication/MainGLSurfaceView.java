package com.example.projectapplication;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Lionel on 11/4/2016.
 */
public class MainGLSurfaceView extends GLSurfaceView {
    private final MainGLRenderer mainGLRenderer;

    public MainGLSurfaceView(Context context)
    {
        super(context);

        this.mainGLRenderer = new MainGLRenderer();

        setRenderer(this.mainGLRenderer);
        // Only update the screen when a change happends
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
