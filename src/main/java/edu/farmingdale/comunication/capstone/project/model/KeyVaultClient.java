package edu.farmingdale.comunication.capstone.project.model;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;

public class KeyVaultClient {
    private static final String KEY_VAULT_URL = "https://communicationkeysvault.vault.azure.net/";

    private static final SecretClient sC = new SecretClientBuilder()
            .vaultUrl(KEY_VAULT_URL)
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();

    public static String getSecret(String sN){
        return sC.getSecret(sN).getValue();
    }
}
