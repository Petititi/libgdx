/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
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

public class Collision implements CollisionConstants {

	/** Temporary Vector3 instance, used by native methods that return a Vector3 instance */
	public final static Vector3 staticVector3 = new Vector3();
	/** Pool of Vector3, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Vector3> poolVector3 = new com.badlogic.gdx.utils.Pool<Vector3>() {
		@Override
		protected Vector3 newObject() {
			return new Vector3();
		}
	};


	/** Temporary Quaternion instance, used by native methods that return a Quaternion instance */
	public final static Quaternion staticQuaternion = new Quaternion();
	/** Pool of Quaternion, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Quaternion> poolQuaternion = new com.badlogic.gdx.utils.Pool<Quaternion>() {
		@Override
		protected Quaternion newObject() {
			return new Quaternion();
		}
	};


	/** Temporary Matrix3 instance, used by native methods that return a Matrix3 instance */
	public final static Matrix3 staticMatrix3 = new Matrix3();
	/** Pool of Matrix3, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix3> poolMatrix3 = new com.badlogic.gdx.utils.Pool<Matrix3>() {
		@Override
		protected Matrix3 newObject() {
			return new Matrix3();
		}
	};


	/** Temporary Matrix4 instance, used by native methods that return a Matrix4 instance */
	public final static Matrix4 staticMatrix4 = new Matrix4();
	/** Pool of Matrix4, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix4> poolMatrix4 = new com.badlogic.gdx.utils.Pool<Matrix4>() {
		@Override
		protected Matrix4 newObject() {
			return new Matrix4();
		}
	};

  public static boolean Intersect(btDbvtAabbMm a, btDbvtAabbMm b) {
    return CollisionJNI.Intersect__SWIG_0(btDbvtAabbMm.getCPtr(a), a, btDbvtAabbMm.getCPtr(b), b);
  }

  public static boolean Intersect(btDbvtAabbMm a, Vector3 b) {
    return CollisionJNI.Intersect__SWIG_1(btDbvtAabbMm.getCPtr(a), a, b);
  }

  public static float Proximity(btDbvtAabbMm a, btDbvtAabbMm b) {
    return CollisionJNI.Proximity(btDbvtAabbMm.getCPtr(a), a, btDbvtAabbMm.getCPtr(b), b);
  }

  public static int Select(btDbvtAabbMm o, btDbvtAabbMm a, btDbvtAabbMm b) {
    return CollisionJNI.Select(btDbvtAabbMm.getCPtr(o), o, btDbvtAabbMm.getCPtr(a), a, btDbvtAabbMm.getCPtr(b), b);
  }

  public static void Merge(btDbvtAabbMm a, btDbvtAabbMm b, btDbvtAabbMm r) {
    CollisionJNI.Merge(btDbvtAabbMm.getCPtr(a), a, btDbvtAabbMm.getCPtr(b), b, btDbvtAabbMm.getCPtr(r), r);
  }

  public static boolean NotEqual(btDbvtAabbMm a, btDbvtAabbMm b) {
    return CollisionJNI.NotEqual(btDbvtAabbMm.getCPtr(a), a, btDbvtAabbMm.getCPtr(b), b);
  }

  public static void setGOverlappingPairs(int value) {
    CollisionJNI.gOverlappingPairs_set(value);
  }

  public static int getGOverlappingPairs() {
    return CollisionJNI.gOverlappingPairs_get();
  }

  public static void setGRemovePairs(int value) {
    CollisionJNI.gRemovePairs_set(value);
  }

  public static int getGRemovePairs() {
    return CollisionJNI.gRemovePairs_get();
  }

  public static void setGAddedPairs(int value) {
    CollisionJNI.gAddedPairs_set(value);
  }

  public static int getGAddedPairs() {
    return CollisionJNI.gAddedPairs_get();
  }

  public static void setGFindPairs(int value) {
    CollisionJNI.gFindPairs_set(value);
  }

  public static int getGFindPairs() {
    return CollisionJNI.gFindPairs_get();
  }

  public static int getBT_NULL_PAIR() {
    return CollisionJNI.BT_NULL_PAIR_get();
  }

  public static boolean gdxCheckFilter(int filter, int flag) {
    return CollisionJNI.gdxCheckFilter__SWIG_0(filter, flag);
  }

  public static boolean gdxCheckFilter(btCollisionObject colObj0, btCollisionObject colObj1) {
    return CollisionJNI.gdxCheckFilter__SWIG_1(btCollisionObject.getCPtr(colObj0), colObj0, btCollisionObject.getCPtr(colObj1), colObj1);
  }

  public static void setGCompoundCompoundChildShapePairCallback(SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool value) {
    CollisionJNI.gCompoundCompoundChildShapePairCallback_set(SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool.getCPtr(value));
  }

  public static SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool getGCompoundCompoundChildShapePairCallback() {
    long cPtr = CollisionJNI.gCompoundCompoundChildShapePairCallback_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool(cPtr, false);
  }

  public static void setGContactAddedCallback(SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool value) {
    CollisionJNI.gContactAddedCallback_set(SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool.getCPtr(value));
  }

  public static SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool getGContactAddedCallback() {
    long cPtr = CollisionJNI.gContactAddedCallback_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_r_btManifoldPoint_p_q_const__btCollisionObjectWrapper_int_int_p_q_const__btCollisionObjectWrapper_int_int__bool(cPtr, false);
  }

  public static int getBT_SIMPLE_NULL_PAIR() {
    return CollisionJNI.BT_SIMPLE_NULL_PAIR_get();
  }

  public static void setGOverlappingSimplePairs(int value) {
    CollisionJNI.gOverlappingSimplePairs_set(value);
  }

  public static int getGOverlappingSimplePairs() {
    return CollisionJNI.gOverlappingSimplePairs_get();
  }

  public static void setGRemoveSimplePairs(int value) {
    CollisionJNI.gRemoveSimplePairs_set(value);
  }

  public static int getGRemoveSimplePairs() {
    return CollisionJNI.gRemoveSimplePairs_get();
  }

  public static void setGAddedSimplePairs(int value) {
    CollisionJNI.gAddedSimplePairs_set(value);
  }

  public static int getGAddedSimplePairs() {
    return CollisionJNI.gAddedSimplePairs_get();
  }

  public static void setGFindSimplePairs(int value) {
    CollisionJNI.gFindSimplePairs_set(value);
  }

  public static int getGFindSimplePairs() {
    return CollisionJNI.gFindSimplePairs_get();
  }

  public static void btGenerateInternalEdgeInfo(btBvhTriangleMeshShape trimeshShape, btTriangleInfoMap triangleInfoMap) {
    CollisionJNI.btGenerateInternalEdgeInfo(btBvhTriangleMeshShape.getCPtr(trimeshShape), trimeshShape, btTriangleInfoMap.getCPtr(triangleInfoMap), triangleInfoMap);
  }

  public static void btAdjustInternalEdgeContacts(btManifoldPoint cp, btCollisionObjectWrapper trimeshColObj0Wrap, btCollisionObjectWrapper otherColObj1Wrap, int partId0, int index0, int normalAdjustFlags) {
    CollisionJNI.btAdjustInternalEdgeContacts__SWIG_0(btManifoldPoint.getCPtr(cp), cp, btCollisionObjectWrapper.getCPtr(trimeshColObj0Wrap), trimeshColObj0Wrap, btCollisionObjectWrapper.getCPtr(otherColObj1Wrap), otherColObj1Wrap, partId0, index0, normalAdjustFlags);
  }

  public static void btAdjustInternalEdgeContacts(btManifoldPoint cp, btCollisionObjectWrapper trimeshColObj0Wrap, btCollisionObjectWrapper otherColObj1Wrap, int partId0, int index0) {
    CollisionJNI.btAdjustInternalEdgeContacts__SWIG_1(btManifoldPoint.getCPtr(cp), cp, btCollisionObjectWrapper.getCPtr(trimeshColObj0Wrap), trimeshColObj0Wrap, btCollisionObjectWrapper.getCPtr(otherColObj1Wrap), otherColObj1Wrap, partId0, index0);
  }

  public static void setGCompoundChildShapePairCallback(SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool value) {
    CollisionJNI.gCompoundChildShapePairCallback_set(SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool.getCPtr(value));
  }

  public static SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool getGCompoundChildShapePairCallback() {
    long cPtr = CollisionJNI.gCompoundChildShapePairCallback_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__btCollisionShape_p_q_const__btCollisionShape__bool(cPtr, false);
  }

  public static void setGContactBreakingThreshold(float value) {
    CollisionJNI.gContactBreakingThreshold_set(value);
  }

  public static float getGContactBreakingThreshold() {
    return CollisionJNI.gContactBreakingThreshold_get();
  }

}
