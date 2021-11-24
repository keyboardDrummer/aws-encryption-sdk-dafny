
// Copyright Amazon.com Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0

include "../StandardLibrary/StandardLibrary.dfy"
include "../Generated/AwsCryptographicMaterialProviders.dfy"
include "Materials.dfy"

module 
  {:extern "Dafny.Aws.Crypto.AwsCryptographicMaterialProvidersClient2.CMM"}
  AwsCryptographicMaterialProviders2.CMM
{
  import opened Wrappers
  import Aws.Crypto
  import Materials

  trait {:termination false} VerifiableInterface
    extends Crypto.ICryptographicMaterialsManager
  {
    method GetEncryptionMaterials(input: Crypto.GetEncryptionMaterialsInput) 
      returns (res: Result<Crypto.GetEncryptionMaterialsOutput, string>)
      ensures res.Success?
      ==>
        && Materials.EncryptionMaterialsWithPlaintextDataKey(res.value.encryptionMaterials)

    method DecryptMaterials(input: Crypto.DecryptMaterialsInput) 
      returns (res: Result<Crypto.DecryptMaterialsOutput, string>)
      ensures res.Success?
      ==>
        && Materials.DecryptionMaterialsWithPlaintextDataKey(res.value.decryptionMaterials)
  }
}