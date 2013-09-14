/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btGjkPairDetector extends BulletBase {
	private long swigCPtr;
	
	protected btGjkPairDetector(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btGjkPairDetector(long cPtr, boolean cMemoryOwn) {
		this("btGjkPairDetector", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btGjkPairDetector obj) {
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
				gdxBulletJNI.delete_btGjkPairDetector(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setLastUsedMethod(int value) {
    gdxBulletJNI.btGjkPairDetector_lastUsedMethod_set(swigCPtr, this, value);
  }

  public int getLastUsedMethod() {
    return gdxBulletJNI.btGjkPairDetector_lastUsedMethod_get(swigCPtr, this);
  }

  public void setCurIter(int value) {
    gdxBulletJNI.btGjkPairDetector_curIter_set(swigCPtr, this, value);
  }

  public int getCurIter() {
    return gdxBulletJNI.btGjkPairDetector_curIter_get(swigCPtr, this);
  }

  public void setDegenerateSimplex(int value) {
    gdxBulletJNI.btGjkPairDetector_degenerateSimplex_set(swigCPtr, this, value);
  }

  public int getDegenerateSimplex() {
    return gdxBulletJNI.btGjkPairDetector_degenerateSimplex_get(swigCPtr, this);
  }

  public void setCatchDegeneracies(int value) {
    gdxBulletJNI.btGjkPairDetector_catchDegeneracies_set(swigCPtr, this, value);
  }

  public int getCatchDegeneracies() {
    return gdxBulletJNI.btGjkPairDetector_catchDegeneracies_get(swigCPtr, this);
  }

  public btGjkPairDetector(btConvexShape objectA, btConvexShape objectB, SWIGTYPE_p_btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver penetrationDepthSolver) {
    this(gdxBulletJNI.new_btGjkPairDetector__SWIG_0(btConvexShape.getCPtr(objectA), objectA, btConvexShape.getCPtr(objectB), objectB, SWIGTYPE_p_btSimplexSolverInterface.getCPtr(simplexSolver), btConvexPenetrationDepthSolver.getCPtr(penetrationDepthSolver), penetrationDepthSolver), true);
  }

  public btGjkPairDetector(btConvexShape objectA, btConvexShape objectB, int shapeTypeA, int shapeTypeB, float marginA, float marginB, SWIGTYPE_p_btSimplexSolverInterface simplexSolver, btConvexPenetrationDepthSolver penetrationDepthSolver) {
    this(gdxBulletJNI.new_btGjkPairDetector__SWIG_1(btConvexShape.getCPtr(objectA), objectA, btConvexShape.getCPtr(objectB), objectB, shapeTypeA, shapeTypeB, marginA, marginB, SWIGTYPE_p_btSimplexSolverInterface.getCPtr(simplexSolver), btConvexPenetrationDepthSolver.getCPtr(penetrationDepthSolver), penetrationDepthSolver), true);
  }

  public void getClosestPoints(ClosestPointInput input, Result output, btIDebugDraw debugDraw, boolean swapResults) {
    gdxBulletJNI.btGjkPairDetector_getClosestPoints__SWIG_0(swigCPtr, this, ClosestPointInput.getCPtr(input), input, Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw, swapResults);
  }

  public void getClosestPoints(ClosestPointInput input, Result output, btIDebugDraw debugDraw) {
    gdxBulletJNI.btGjkPairDetector_getClosestPoints__SWIG_1(swigCPtr, this, ClosestPointInput.getCPtr(input), input, Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw);
  }

  public void getClosestPointsNonVirtual(ClosestPointInput input, Result output, btIDebugDraw debugDraw) {
    gdxBulletJNI.btGjkPairDetector_getClosestPointsNonVirtual(swigCPtr, this, ClosestPointInput.getCPtr(input), input, Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw);
  }

  public void setMinkowskiA(btConvexShape minkA) {
    gdxBulletJNI.btGjkPairDetector_setMinkowskiA(swigCPtr, this, btConvexShape.getCPtr(minkA), minkA);
  }

  public void setMinkowskiB(btConvexShape minkB) {
    gdxBulletJNI.btGjkPairDetector_setMinkowskiB(swigCPtr, this, btConvexShape.getCPtr(minkB), minkB);
  }

  public void setCachedSeperatingAxis(Vector3 seperatingAxis) {
    gdxBulletJNI.btGjkPairDetector_setCachedSeperatingAxis(swigCPtr, this, seperatingAxis);
  }

  public Vector3 getCachedSeparatingAxis() {
	return gdxBulletJNI.btGjkPairDetector_getCachedSeparatingAxis(swigCPtr, this);
}

  public float getCachedSeparatingDistance() {
    return gdxBulletJNI.btGjkPairDetector_getCachedSeparatingDistance(swigCPtr, this);
  }

  public void setPenetrationDepthSolver(btConvexPenetrationDepthSolver penetrationDepthSolver) {
    gdxBulletJNI.btGjkPairDetector_setPenetrationDepthSolver(swigCPtr, this, btConvexPenetrationDepthSolver.getCPtr(penetrationDepthSolver), penetrationDepthSolver);
  }

  public void setIgnoreMargin(boolean ignoreMargin) {
    gdxBulletJNI.btGjkPairDetector_setIgnoreMargin(swigCPtr, this, ignoreMargin);
  }

}
