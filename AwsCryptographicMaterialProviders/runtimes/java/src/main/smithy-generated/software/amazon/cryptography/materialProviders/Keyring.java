// Copyright Amazon.com Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0
// Do not modify this file. This file is machine generated, and any changes to it will be overwritten.
package software.amazon.cryptography.materialProviders;

import Dafny.Aws.Cryptography.MaterialProviders.Types.Error;
import Wrappers_Compile.Result;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.util.Objects;
import software.amazon.cryptography.materialProviders.model.NativeError;
import software.amazon.cryptography.materialProviders.model.OnDecryptInput;
import software.amazon.cryptography.materialProviders.model.OnDecryptOutput;
import software.amazon.cryptography.materialProviders.model.OnEncryptInput;
import software.amazon.cryptography.materialProviders.model.OnEncryptOutput;
import software.amazon.cryptography.materialProviders.model.OpaqueError;

public final class Keyring implements IKeyring {
  private final Dafny.Aws.Cryptography.MaterialProviders.Types.IKeyring _impl;

  private Keyring(Dafny.Aws.Cryptography.MaterialProviders.Types.IKeyring iKeyring) {
    Objects.requireNonNull(iKeyring, "Missing value for required argument `iKeyring`");
    this._impl = iKeyring;
  }

  public static Keyring create(Dafny.Aws.Cryptography.MaterialProviders.Types.IKeyring iKeyring) {
    return new Keyring(iKeyring);
  }

  public static <I extends IKeyring> Keyring create(I iKeyring) {
    Objects.requireNonNull(iKeyring, "Missing value for required argument `iKeyring`");
    if (iKeyring instanceof software.amazon.cryptography.materialProviders.Keyring) {
      return ((Keyring) iKeyring);
    }
    return Keyring.create(new NativeWrapper(iKeyring));
  }

  public Dafny.Aws.Cryptography.MaterialProviders.Types.IKeyring impl() {
    return this._impl;
  }

  public OnEncryptOutput OnEncrypt(OnEncryptInput nativeValue) {
    Dafny.Aws.Cryptography.MaterialProviders.Types.OnEncryptInput dafnyValue = ToDafny.OnEncryptInput(nativeValue);
    Result<Dafny.Aws.Cryptography.MaterialProviders.Types.OnEncryptOutput, Error> result = this._impl.OnEncrypt(dafnyValue);
    if (result.is_Failure()) {
      throw ToNative.Error(result.dtor_error());
    }
    return ToNative.OnEncryptOutput(result.dtor_value());
  }

  public OnDecryptOutput OnDecrypt(OnDecryptInput nativeValue) {
    Dafny.Aws.Cryptography.MaterialProviders.Types.OnDecryptInput dafnyValue = ToDafny.OnDecryptInput(nativeValue);
    Result<Dafny.Aws.Cryptography.MaterialProviders.Types.OnDecryptOutput, Error> result = this._impl.OnDecrypt(dafnyValue);
    if (result.is_Failure()) {
      throw ToNative.Error(result.dtor_error());
    }
    return ToNative.OnDecryptOutput(result.dtor_value());
  }

  private static final class NativeWrapper implements Dafny.Aws.Cryptography.MaterialProviders.Types.IKeyring {
    private final IKeyring _impl;

    NativeWrapper(IKeyring nativeImpl) {
      if (nativeImpl instanceof Keyring) {
        throw new IllegalArgumentException("Recursive wrapping is strictly forbidden.");
      }
      this._impl = nativeImpl;
    }

    public Result<Dafny.Aws.Cryptography.MaterialProviders.Types.OnEncryptOutput, Error> OnEncrypt(
        Dafny.Aws.Cryptography.MaterialProviders.Types.OnEncryptInput dafnyInput) {
      OnEncryptInput nativeInput = ToNative.OnEncryptInput(dafnyInput);
      try {
        OnEncryptOutput nativeOutput = this._impl.OnEncrypt(nativeInput);
        Dafny.Aws.Cryptography.MaterialProviders.Types.OnEncryptOutput dafnyOutput = ToDafny.OnEncryptOutput(nativeOutput);
        return Result.create_Success(dafnyOutput);
      } catch (NativeError ex) {
        return Result.create_Failure(ToDafny.Error(ex));
      } catch (Exception ex) {
        OpaqueError error = OpaqueError.builder().obj(ex).cause(ex).build();
        return Result.create_Failure(ToDafny.Error(error));
      }
    }

    public Result<Dafny.Aws.Cryptography.MaterialProviders.Types.OnEncryptOutput, Error> OnEncrypt_k(
        Dafny.Aws.Cryptography.MaterialProviders.Types.OnEncryptInput dafnyInput) {
      throw NativeError.builder().message("Not supported at this time.").build();
    }

    public Result<Dafny.Aws.Cryptography.MaterialProviders.Types.OnDecryptOutput, Error> OnDecrypt(
        Dafny.Aws.Cryptography.MaterialProviders.Types.OnDecryptInput dafnyInput) {
      OnDecryptInput nativeInput = ToNative.OnDecryptInput(dafnyInput);
      try {
        OnDecryptOutput nativeOutput = this._impl.OnDecrypt(nativeInput);
        Dafny.Aws.Cryptography.MaterialProviders.Types.OnDecryptOutput dafnyOutput = ToDafny.OnDecryptOutput(nativeOutput);
        return Result.create_Success(dafnyOutput);
      } catch (NativeError ex) {
        return Result.create_Failure(ToDafny.Error(ex));
      } catch (Exception ex) {
        OpaqueError error = OpaqueError.builder().obj(ex).cause(ex).build();
        return Result.create_Failure(ToDafny.Error(error));
      }
    }

    public Result<Dafny.Aws.Cryptography.MaterialProviders.Types.OnDecryptOutput, Error> OnDecrypt_k(
        Dafny.Aws.Cryptography.MaterialProviders.Types.OnDecryptInput dafnyInput) {
      throw NativeError.builder().message("Not supported at this time.").build();
    }
  }
}