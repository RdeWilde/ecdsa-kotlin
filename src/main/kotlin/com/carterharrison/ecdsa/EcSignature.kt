package com.carterharrison.ecdsa

import java.math.BigInteger


/**
 * A class to hold R and S values from a signature.
 *
 * @property r The r value of the signature
 * @property s The s value of the signature
 */
class EcSignature (val r : BigInteger, val s : BigInteger)