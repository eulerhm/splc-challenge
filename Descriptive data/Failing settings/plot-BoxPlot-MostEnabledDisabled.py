import pandas as pd
import matplotlib.pyplot as plt

my_data = pd.Series([35, 8])
my_data.plot(kind = 'box', title = 'Most-Enabled-Disabled', ylabel = 'Failures', use_index = False)
plt.show()
