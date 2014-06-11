/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btIDebugDraw extends BulletBase {
	private long swigCPtr;
	
	protected btIDebugDraw(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btIDebugDraw, normally you should not need this constructor it's intended for low-level usage. */ 
	public btIDebugDraw(long cPtr, boolean cMemoryOwn) {
		this("btIDebugDraw", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btIDebugDraw obj) {
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
				LinearMathJNI.delete_btIDebugDraw(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    LinearMathJNI.btIDebugDraw_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    LinearMathJNI.btIDebugDraw_change_ownership(this, swigCPtr, true);
  }

  public void drawLine(btVector3 from, btVector3 to, btVector3 color) {
    LinearMathJNI.btIDebugDraw_drawLine__SWIG_0(swigCPtr, this, btVector3.getCPtr(from), from, btVector3.getCPtr(to), to, btVector3.getCPtr(color), color);
  }

  public void drawLine(btVector3 from, btVector3 to, btVector3 fromColor, btVector3 toColor) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawLine__SWIG_1(swigCPtr, this, btVector3.getCPtr(from), from, btVector3.getCPtr(to), to, btVector3.getCPtr(fromColor), fromColor, btVector3.getCPtr(toColor), toColor); else LinearMathJNI.btIDebugDraw_drawLineSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, btVector3.getCPtr(from), from, btVector3.getCPtr(to), to, btVector3.getCPtr(fromColor), fromColor, btVector3.getCPtr(toColor), toColor);
  }

  public void drawSphere(float radius, btTransform transform, btVector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawSphere__SWIG_0(swigCPtr, this, radius, btTransform.getCPtr(transform), transform, btVector3.getCPtr(color), color); else LinearMathJNI.btIDebugDraw_drawSphereSwigExplicitbtIDebugDraw__SWIG_0(swigCPtr, this, radius, btTransform.getCPtr(transform), transform, btVector3.getCPtr(color), color);
  }

  public void drawSphere(btVector3 p, float radius, btVector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawSphere__SWIG_1(swigCPtr, this, btVector3.getCPtr(p), p, radius, btVector3.getCPtr(color), color); else LinearMathJNI.btIDebugDraw_drawSphereSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, btVector3.getCPtr(p), p, radius, btVector3.getCPtr(color), color);
  }

  public void drawTriangle(btVector3 v0, btVector3 v1, btVector3 v2, btVector3 arg3, btVector3 arg4, btVector3 arg5, btVector3 color, float alpha) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawTriangle__SWIG_0(swigCPtr, this, btVector3.getCPtr(v0), v0, btVector3.getCPtr(v1), v1, btVector3.getCPtr(v2), v2, btVector3.getCPtr(arg3), arg3, btVector3.getCPtr(arg4), arg4, btVector3.getCPtr(arg5), arg5, btVector3.getCPtr(color), color, alpha); else LinearMathJNI.btIDebugDraw_drawTriangleSwigExplicitbtIDebugDraw__SWIG_0(swigCPtr, this, btVector3.getCPtr(v0), v0, btVector3.getCPtr(v1), v1, btVector3.getCPtr(v2), v2, btVector3.getCPtr(arg3), arg3, btVector3.getCPtr(arg4), arg4, btVector3.getCPtr(arg5), arg5, btVector3.getCPtr(color), color, alpha);
  }

  public void drawTriangle(btVector3 v0, btVector3 v1, btVector3 v2, btVector3 color, float arg4) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawTriangle__SWIG_1(swigCPtr, this, btVector3.getCPtr(v0), v0, btVector3.getCPtr(v1), v1, btVector3.getCPtr(v2), v2, btVector3.getCPtr(color), color, arg4); else LinearMathJNI.btIDebugDraw_drawTriangleSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, btVector3.getCPtr(v0), v0, btVector3.getCPtr(v1), v1, btVector3.getCPtr(v2), v2, btVector3.getCPtr(color), color, arg4);
  }

  public void drawContactPoint(btVector3 PointOnB, btVector3 normalOnB, float distance, int lifeTime, btVector3 color) {
    LinearMathJNI.btIDebugDraw_drawContactPoint(swigCPtr, this, btVector3.getCPtr(PointOnB), PointOnB, btVector3.getCPtr(normalOnB), normalOnB, distance, lifeTime, btVector3.getCPtr(color), color);
  }

  public void reportErrorWarning(String warningString) {
    LinearMathJNI.btIDebugDraw_reportErrorWarning(swigCPtr, this, warningString);
  }

  public void draw3dText(btVector3 location, String textString) {
    LinearMathJNI.btIDebugDraw_draw3dText(swigCPtr, this, btVector3.getCPtr(location), location, textString);
  }

  public void setDebugMode(int debugMode) {
    LinearMathJNI.btIDebugDraw_setDebugMode(swigCPtr, this, debugMode);
  }

  public int getDebugMode() {
    return LinearMathJNI.btIDebugDraw_getDebugMode(swigCPtr, this);
  }

  public void drawAabb(btVector3 from, btVector3 to, btVector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawAabb(swigCPtr, this, btVector3.getCPtr(from), from, btVector3.getCPtr(to), to, btVector3.getCPtr(color), color); else LinearMathJNI.btIDebugDraw_drawAabbSwigExplicitbtIDebugDraw(swigCPtr, this, btVector3.getCPtr(from), from, btVector3.getCPtr(to), to, btVector3.getCPtr(color), color);
  }

  public void drawTransform(btTransform transform, float orthoLen) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawTransform(swigCPtr, this, btTransform.getCPtr(transform), transform, orthoLen); else LinearMathJNI.btIDebugDraw_drawTransformSwigExplicitbtIDebugDraw(swigCPtr, this, btTransform.getCPtr(transform), transform, orthoLen);
  }

  public void drawArc(btVector3 center, btVector3 normal, btVector3 axis, float radiusA, float radiusB, float minAngle, float maxAngle, btVector3 color, boolean drawSect, float stepDegrees) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawArc__SWIG_0(swigCPtr, this, btVector3.getCPtr(center), center, btVector3.getCPtr(normal), normal, btVector3.getCPtr(axis), axis, radiusA, radiusB, minAngle, maxAngle, btVector3.getCPtr(color), color, drawSect, stepDegrees); else LinearMathJNI.btIDebugDraw_drawArcSwigExplicitbtIDebugDraw__SWIG_0(swigCPtr, this, btVector3.getCPtr(center), center, btVector3.getCPtr(normal), normal, btVector3.getCPtr(axis), axis, radiusA, radiusB, minAngle, maxAngle, btVector3.getCPtr(color), color, drawSect, stepDegrees);
  }

  public void drawArc(btVector3 center, btVector3 normal, btVector3 axis, float radiusA, float radiusB, float minAngle, float maxAngle, btVector3 color, boolean drawSect) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawArc__SWIG_1(swigCPtr, this, btVector3.getCPtr(center), center, btVector3.getCPtr(normal), normal, btVector3.getCPtr(axis), axis, radiusA, radiusB, minAngle, maxAngle, btVector3.getCPtr(color), color, drawSect); else LinearMathJNI.btIDebugDraw_drawArcSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, btVector3.getCPtr(center), center, btVector3.getCPtr(normal), normal, btVector3.getCPtr(axis), axis, radiusA, radiusB, minAngle, maxAngle, btVector3.getCPtr(color), color, drawSect);
  }

  public void drawSpherePatch(btVector3 center, btVector3 up, btVector3 axis, float radius, float minTh, float maxTh, float minPs, float maxPs, btVector3 color, float stepDegrees, boolean drawCenter) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawSpherePatch__SWIG_0(swigCPtr, this, btVector3.getCPtr(center), center, btVector3.getCPtr(up), up, btVector3.getCPtr(axis), axis, radius, minTh, maxTh, minPs, maxPs, btVector3.getCPtr(color), color, stepDegrees, drawCenter); else LinearMathJNI.btIDebugDraw_drawSpherePatchSwigExplicitbtIDebugDraw__SWIG_0(swigCPtr, this, btVector3.getCPtr(center), center, btVector3.getCPtr(up), up, btVector3.getCPtr(axis), axis, radius, minTh, maxTh, minPs, maxPs, btVector3.getCPtr(color), color, stepDegrees, drawCenter);
  }

  public void drawSpherePatch(btVector3 center, btVector3 up, btVector3 axis, float radius, float minTh, float maxTh, float minPs, float maxPs, btVector3 color, float stepDegrees) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawSpherePatch__SWIG_1(swigCPtr, this, btVector3.getCPtr(center), center, btVector3.getCPtr(up), up, btVector3.getCPtr(axis), axis, radius, minTh, maxTh, minPs, maxPs, btVector3.getCPtr(color), color, stepDegrees); else LinearMathJNI.btIDebugDraw_drawSpherePatchSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, btVector3.getCPtr(center), center, btVector3.getCPtr(up), up, btVector3.getCPtr(axis), axis, radius, minTh, maxTh, minPs, maxPs, btVector3.getCPtr(color), color, stepDegrees);
  }

  public void drawSpherePatch(btVector3 center, btVector3 up, btVector3 axis, float radius, float minTh, float maxTh, float minPs, float maxPs, btVector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawSpherePatch__SWIG_2(swigCPtr, this, btVector3.getCPtr(center), center, btVector3.getCPtr(up), up, btVector3.getCPtr(axis), axis, radius, minTh, maxTh, minPs, maxPs, btVector3.getCPtr(color), color); else LinearMathJNI.btIDebugDraw_drawSpherePatchSwigExplicitbtIDebugDraw__SWIG_2(swigCPtr, this, btVector3.getCPtr(center), center, btVector3.getCPtr(up), up, btVector3.getCPtr(axis), axis, radius, minTh, maxTh, minPs, maxPs, btVector3.getCPtr(color), color);
  }

  public void drawBox(btVector3 bbMin, btVector3 bbMax, btVector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawBox__SWIG_0(swigCPtr, this, btVector3.getCPtr(bbMin), bbMin, btVector3.getCPtr(bbMax), bbMax, btVector3.getCPtr(color), color); else LinearMathJNI.btIDebugDraw_drawBoxSwigExplicitbtIDebugDraw__SWIG_0(swigCPtr, this, btVector3.getCPtr(bbMin), bbMin, btVector3.getCPtr(bbMax), bbMax, btVector3.getCPtr(color), color);
  }

  public void drawBox(btVector3 bbMin, btVector3 bbMax, btTransform trans, btVector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawBox__SWIG_1(swigCPtr, this, btVector3.getCPtr(bbMin), bbMin, btVector3.getCPtr(bbMax), bbMax, btTransform.getCPtr(trans), trans, btVector3.getCPtr(color), color); else LinearMathJNI.btIDebugDraw_drawBoxSwigExplicitbtIDebugDraw__SWIG_1(swigCPtr, this, btVector3.getCPtr(bbMin), bbMin, btVector3.getCPtr(bbMax), bbMax, btTransform.getCPtr(trans), trans, btVector3.getCPtr(color), color);
  }

  public void drawCapsule(float radius, float halfHeight, int upAxis, btTransform transform, btVector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawCapsule(swigCPtr, this, radius, halfHeight, upAxis, btTransform.getCPtr(transform), transform, btVector3.getCPtr(color), color); else LinearMathJNI.btIDebugDraw_drawCapsuleSwigExplicitbtIDebugDraw(swigCPtr, this, radius, halfHeight, upAxis, btTransform.getCPtr(transform), transform, btVector3.getCPtr(color), color);
  }

  public void drawCylinder(float radius, float halfHeight, int upAxis, btTransform transform, btVector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawCylinder(swigCPtr, this, radius, halfHeight, upAxis, btTransform.getCPtr(transform), transform, btVector3.getCPtr(color), color); else LinearMathJNI.btIDebugDraw_drawCylinderSwigExplicitbtIDebugDraw(swigCPtr, this, radius, halfHeight, upAxis, btTransform.getCPtr(transform), transform, btVector3.getCPtr(color), color);
  }

  public void drawCone(float radius, float height, int upAxis, btTransform transform, btVector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawCone(swigCPtr, this, radius, height, upAxis, btTransform.getCPtr(transform), transform, btVector3.getCPtr(color), color); else LinearMathJNI.btIDebugDraw_drawConeSwigExplicitbtIDebugDraw(swigCPtr, this, radius, height, upAxis, btTransform.getCPtr(transform), transform, btVector3.getCPtr(color), color);
  }

  public void drawPlane(btVector3 planeNormal, float planeConst, btTransform transform, btVector3 color) {
    if (getClass() == btIDebugDraw.class) LinearMathJNI.btIDebugDraw_drawPlane(swigCPtr, this, btVector3.getCPtr(planeNormal), planeNormal, planeConst, btTransform.getCPtr(transform), transform, btVector3.getCPtr(color), color); else LinearMathJNI.btIDebugDraw_drawPlaneSwigExplicitbtIDebugDraw(swigCPtr, this, btVector3.getCPtr(planeNormal), planeNormal, planeConst, btTransform.getCPtr(transform), transform, btVector3.getCPtr(color), color);
  }

  public btIDebugDraw() {
    this(LinearMathJNI.new_btIDebugDraw(), true);
    LinearMathJNI.btIDebugDraw_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public final static class DebugDrawModes {
    public final static int DBG_NoDebug = 0;
    public final static int DBG_DrawWireframe = 1;
    public final static int DBG_DrawAabb = 2;
    public final static int DBG_DrawFeaturesText = 4;
    public final static int DBG_DrawContactPoints = 8;
    public final static int DBG_NoDeactivation = 16;
    public final static int DBG_NoHelpText = 32;
    public final static int DBG_DrawText = 64;
    public final static int DBG_ProfileTimings = 128;
    public final static int DBG_EnableSatComparison = 256;
    public final static int DBG_DisableBulletLCP = 512;
    public final static int DBG_EnableCCD = 1024;
    public final static int DBG_DrawConstraints = (1 << 11);
    public final static int DBG_DrawConstraintLimits = (1 << 12);
    public final static int DBG_FastWireframe = (1 << 13);
    public final static int DBG_DrawNormals = (1 << 14);
    public final static int DBG_MAX_DEBUG_DRAW_MODE = DBG_DrawNormals + 1;
  }

}
