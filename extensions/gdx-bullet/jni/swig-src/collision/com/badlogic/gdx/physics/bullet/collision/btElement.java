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

public class btElement extends BulletBase {
	private long swigCPtr;
	
	protected btElement(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btElement, normally you should not need this constructor it's intended for low-level usage. */ 
	public btElement(long cPtr, boolean cMemoryOwn) {
		this("btElement", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btElement obj) {
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
				CollisionJNI.delete_btElement(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setId(int value) {
    CollisionJNI.btElement_id_set(swigCPtr, this, value);
  }

  public int getId() {
    return CollisionJNI.btElement_id_get(swigCPtr, this);
  }

  public void setSz(int value) {
    CollisionJNI.btElement_sz_set(swigCPtr, this, value);
  }

  public int getSz() {
    return CollisionJNI.btElement_sz_get(swigCPtr, this);
  }

  public btElement() {
    this(CollisionJNI.new_btElement(), true);
  }

}
