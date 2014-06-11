/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btPolyhedralConvexShape extends btConvexInternalShape {
	private long swigCPtr;
	
	protected btPolyhedralConvexShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btPolyhedralConvexShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btPolyhedralConvexShape, normally you should not need this constructor it's intended for low-level usage. */
	public btPolyhedralConvexShape(long cPtr, boolean cMemoryOwn) {
		this("btPolyhedralConvexShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btPolyhedralConvexShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btPolyhedralConvexShape obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btPolyhedralConvexShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public boolean initializePolyhedralFeatures(int shiftVerticesByMargin) {
    return CollisionJNI.btPolyhedralConvexShape_initializePolyhedralFeatures__SWIG_0(swigCPtr, this, shiftVerticesByMargin);
  }

  public boolean initializePolyhedralFeatures() {
    return CollisionJNI.btPolyhedralConvexShape_initializePolyhedralFeatures__SWIG_1(swigCPtr, this);
  }

  public btConvexPolyhedron getConvexPolyhedron() {
    long cPtr = CollisionJNI.btPolyhedralConvexShape_getConvexPolyhedron(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexPolyhedron(cPtr, false);
  }

  public int getNumVertices() {
    return CollisionJNI.btPolyhedralConvexShape_getNumVertices(swigCPtr, this);
  }

  public int getNumEdges() {
    return CollisionJNI.btPolyhedralConvexShape_getNumEdges(swigCPtr, this);
  }

  public void getEdge(int i, Vector3 pa, Vector3 pb) {
    CollisionJNI.btPolyhedralConvexShape_getEdge(swigCPtr, this, i, pa, pb);
  }

  public void getVertex(int i, Vector3 vtx) {
    CollisionJNI.btPolyhedralConvexShape_getVertex(swigCPtr, this, i, vtx);
  }

  public int getNumPlanes() {
    return CollisionJNI.btPolyhedralConvexShape_getNumPlanes(swigCPtr, this);
  }

  public void getPlane(Vector3 planeNormal, Vector3 planeSupport, int i) {
    CollisionJNI.btPolyhedralConvexShape_getPlane(swigCPtr, this, planeNormal, planeSupport, i);
  }

  public boolean isInside(Vector3 pt, float tolerance) {
    return CollisionJNI.btPolyhedralConvexShape_isInside(swigCPtr, this, pt, tolerance);
  }

}
