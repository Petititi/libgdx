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

public class btDynamicsWorld extends btCollisionWorld {
	private long swigCPtr;
	
	protected btDynamicsWorld(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, gdxBulletJNI.btDynamicsWorld_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btDynamicsWorld(long cPtr, boolean cMemoryOwn) {
		this("btDynamicsWorld", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(gdxBulletJNI.btDynamicsWorld_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btDynamicsWorld obj) {
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
				gdxBulletJNI.delete_btDynamicsWorld(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public int stepSimulation(float timeStep, int maxSubSteps, float fixedTimeStep) {
    return gdxBulletJNI.btDynamicsWorld_stepSimulation__SWIG_0(swigCPtr, this, timeStep, maxSubSteps, fixedTimeStep);
  }

  public int stepSimulation(float timeStep, int maxSubSteps) {
    return gdxBulletJNI.btDynamicsWorld_stepSimulation__SWIG_1(swigCPtr, this, timeStep, maxSubSteps);
  }

  public int stepSimulation(float timeStep) {
    return gdxBulletJNI.btDynamicsWorld_stepSimulation__SWIG_2(swigCPtr, this, timeStep);
  }

  public void addConstraint(btTypedConstraint constraint, boolean disableCollisionsBetweenLinkedBodies) {
    gdxBulletJNI.btDynamicsWorld_addConstraint__SWIG_0(swigCPtr, this, btTypedConstraint.getCPtr(constraint), constraint, disableCollisionsBetweenLinkedBodies);
  }

  public void addConstraint(btTypedConstraint constraint) {
    gdxBulletJNI.btDynamicsWorld_addConstraint__SWIG_1(swigCPtr, this, btTypedConstraint.getCPtr(constraint), constraint);
  }

  public void removeConstraint(btTypedConstraint constraint) {
    gdxBulletJNI.btDynamicsWorld_removeConstraint(swigCPtr, this, btTypedConstraint.getCPtr(constraint), constraint);
  }

  public void addAction(btActionInterface action) {
    gdxBulletJNI.btDynamicsWorld_addAction(swigCPtr, this, btActionInterface.getCPtr(action), action);
  }

  public void removeAction(btActionInterface action) {
    gdxBulletJNI.btDynamicsWorld_removeAction(swigCPtr, this, btActionInterface.getCPtr(action), action);
  }

  public void setGravity(Vector3 gravity) {
    gdxBulletJNI.btDynamicsWorld_setGravity(swigCPtr, this, gravity);
  }

  public Vector3 getGravity() {
	return gdxBulletJNI.btDynamicsWorld_getGravity(swigCPtr, this);
}

  public void synchronizeMotionStates() {
    gdxBulletJNI.btDynamicsWorld_synchronizeMotionStates(swigCPtr, this);
  }

  public void addRigidBody(btRigidBody body) {
    gdxBulletJNI.btDynamicsWorld_addRigidBody__SWIG_0(swigCPtr, this, btRigidBody.getCPtr(body), body);
  }

  public void addRigidBody(btRigidBody body, short group, short mask) {
    gdxBulletJNI.btDynamicsWorld_addRigidBody__SWIG_1(swigCPtr, this, btRigidBody.getCPtr(body), body, group, mask);
  }

  public void removeRigidBody(btRigidBody body) {
    gdxBulletJNI.btDynamicsWorld_removeRigidBody(swigCPtr, this, btRigidBody.getCPtr(body), body);
  }

  public void setConstraintSolver(btConstraintSolver solver) {
    gdxBulletJNI.btDynamicsWorld_setConstraintSolver(swigCPtr, this, btConstraintSolver.getCPtr(solver), solver);
  }

  public btConstraintSolver getConstraintSolver() {
    long cPtr = gdxBulletJNI.btDynamicsWorld_getConstraintSolver(swigCPtr, this);
    return (cPtr == 0) ? null : new btConstraintSolver(cPtr, false);
  }

  public int getNumConstraints() {
    return gdxBulletJNI.btDynamicsWorld_getNumConstraints(swigCPtr, this);
  }

  public btTypedConstraint getConstraint(int index) {
    long cPtr = gdxBulletJNI.btDynamicsWorld_getConstraint__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btTypedConstraint(cPtr, false);
  }

  public int getWorldType() {
    return gdxBulletJNI.btDynamicsWorld_getWorldType(swigCPtr, this);
  }

  public void clearForces() {
    gdxBulletJNI.btDynamicsWorld_clearForces(swigCPtr, this);
  }

  public void setInternalTickCallback(SWIGTYPE_p_f_p_btDynamicsWorld_float__void cb, SWIGTYPE_p_void worldUserInfo, boolean isPreTick) {
    gdxBulletJNI.btDynamicsWorld_setInternalTickCallback__SWIG_0(swigCPtr, this, SWIGTYPE_p_f_p_btDynamicsWorld_float__void.getCPtr(cb), SWIGTYPE_p_void.getCPtr(worldUserInfo), isPreTick);
  }

  public void setInternalTickCallback(SWIGTYPE_p_f_p_btDynamicsWorld_float__void cb, SWIGTYPE_p_void worldUserInfo) {
    gdxBulletJNI.btDynamicsWorld_setInternalTickCallback__SWIG_1(swigCPtr, this, SWIGTYPE_p_f_p_btDynamicsWorld_float__void.getCPtr(cb), SWIGTYPE_p_void.getCPtr(worldUserInfo));
  }

  public void setInternalTickCallback(SWIGTYPE_p_f_p_btDynamicsWorld_float__void cb) {
    gdxBulletJNI.btDynamicsWorld_setInternalTickCallback__SWIG_2(swigCPtr, this, SWIGTYPE_p_f_p_btDynamicsWorld_float__void.getCPtr(cb));
  }

  public void setWorldUserInfo(SWIGTYPE_p_void worldUserInfo) {
    gdxBulletJNI.btDynamicsWorld_setWorldUserInfo(swigCPtr, this, SWIGTYPE_p_void.getCPtr(worldUserInfo));
  }

  public SWIGTYPE_p_void getWorldUserInfo() {
    long cPtr = gdxBulletJNI.btDynamicsWorld_getWorldUserInfo(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public btContactSolverInfo getSolverInfo() {
    return new btContactSolverInfo(gdxBulletJNI.btDynamicsWorld_getSolverInfo(swigCPtr, this), false);
  }

  public void addVehicle(btActionInterface vehicle) {
    gdxBulletJNI.btDynamicsWorld_addVehicle(swigCPtr, this, btActionInterface.getCPtr(vehicle), vehicle);
  }

  public void removeVehicle(btActionInterface vehicle) {
    gdxBulletJNI.btDynamicsWorld_removeVehicle(swigCPtr, this, btActionInterface.getCPtr(vehicle), vehicle);
  }

  public void addCharacter(btActionInterface character) {
    gdxBulletJNI.btDynamicsWorld_addCharacter(swigCPtr, this, btActionInterface.getCPtr(character), character);
  }

  public void removeCharacter(btActionInterface character) {
    gdxBulletJNI.btDynamicsWorld_removeCharacter(swigCPtr, this, btActionInterface.getCPtr(character), character);
  }

}
